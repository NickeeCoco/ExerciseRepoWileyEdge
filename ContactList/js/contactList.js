$(document).ready(function () {

    loadContacts();
    addContact();
    updateContact();

})

function loadContacts() {
    clearContactTable();

    let contentRows = $('#contentRows');

    $.ajax({
        type: 'GET',
        url: 'http://contactlist.us-east-1.elasticbeanstalk.com/contacts',
        success: function (contactArray) {
            $.each(contactArray, function (index, contact) {
                let name = `${contact.firstName} ${contact.lastName}`;
                let company = contact.company;
                let contactId = contact.contactId;

                let row = `
                    <tr>
                        <td>${name}</td>
                        <td>${company}</td>
                        <td>
                            <a onclick="showEditForm(${contactId})">
                                <button type="button" class="btn btn-info">Edit</button>
                            </a>
                        <td>
                        <td>
                            <button type="button" class="btn btn-danger" onclick="deleteContact(${contactId})">Delete</button>
                        </td>
                    </tr>`

                contentRows.append(row);
            })
        },
        error: function () {
            $('#errorMessages')
                .append($('<li>')
                    .attr({
                        class: 'list-group-item list-group-item-danger'
                    })
                    .text('Error calling web service. Please try again later.'));
        }
    })
}

function addContact() {
    $('#addButton').click(function (event) {
        let haveValidationErrors = checkAndDisplayValidationErrors($('#addForm').find('input'));

        if(haveValidationErrors) {
            return false;
        }

        $.ajax({
            type: 'POST',
            url: 'http://contactlist.us-east-1.elasticbeanstalk.com/contact',
            data: JSON.stringify({
                firstName: $('#addFirstName').val(),
                lastName: $('#addLastName').val(),
                company: $('#addCompany').val(),
                phone: $('#addPhone').val(),
                email: $('#addEmail').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json',
            success: function () {
                $('#errorMessages').empty();
                $('#addFirstName').val('');
                $('#addLastName').val('');
                $('#addCompany').val('');
                $('#addphone').val('');
                $('#addEmail').val('');
                loadContacts();
            },
            error: function () {
                $('#errorMessages')
                    .append($('<li>')
                        .attr({
                            class: 'list-group-item list-group-item-danger'
                        })
                        .text('Error calling web service. Please try again later.'));
            }
        })
    })
}

function clearContactTable() {
    $('#contentRows').empty();
}

function showEditForm(contactId) {
    $('#errorMessages').empty();

    $.ajax({
        type: 'GET',
        url: `http://contactlist.us-east-1.elasticbeanstalk.com/contact/${contactId}`,
        success: function (data, status) {
            $('#editFirstName').val(data.firstName);
            $('#editLastName').val(data.lastName);
            $('#editCompany').val(data.company);
            $('#editPhone').val(data.phone);
            $('#editEmail').val(data.email);
            $('#editContactId').val(data.contactId);

        },
        error: function () {
            $('#errorMessages')
                .append($('<li>')
                    .attr({
                        class: 'list-group-item list-group-item-danger'
                    })
                    .text('Error calling web service. Please try again later.'));
        }
    })

    $('#contactTableDiv').hide();
    $('#editFormDiv').show();
}

function hideEditForm() {
    $('#errorMessages').empty();

    $('#editFirstName').val('');
    $('#editLastName').val('');
    $('#editCompany').val('');
    $('#editPhone').val('');
    $('#editEmail').val('');

    $('#contactTableDiv').show();
    $('#editFormDiv').hide();
}

function updateContact() {
    $('#updateButton').click(function (event) {
        let haveValidationErrors = checkAndDisplayValidationErrors($('#editForm').find('input'));

        if(haveValidationErrors) {
            return false;
        }

        $.ajax({
            type: 'PUT',
            url: 'http://contactlist.us-east-1.elasticbeanstalk.com/contact/' + $('#editContactId').val(),
            data: JSON.stringify({
                contactId: $('#editContactId').val(),
                firstName: $('#editFirstName').val(),
                lastName: $('#editLastName').val(),
                company: $('#editCompany').val(),
                phone: $('#editPhone').val(),
                email: $('#editEmail').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json',
            'success': function () {
                $('#errorMessage').empty();
                hideEditForm();
                loadContacts();
            },
            'error': function () {
                $('#errorMessages')
                    .append($('<li>')
                        .attr({
                            class: 'list-group-item list-group-item-danger'
                        })
                        .text('Error calling web service. Please try again later.'));
            }
        })
    })
}

function deleteContact(contactId) {
    $.ajax({
        type: 'DELETE',
        url: `http://contactlist.us-east-1.elasticbeanstalk.com/contact/${contactId}`,
        success: function () {
            loadContacts();
        }
    })
}

function checkAndDisplayValidationErrors(input) {
    $('#errorMessages').empty();

    let errorMessages = [];

    input.each(function () {
        if (!this.validity.valid) {
            let errorField = $('label[for=' + this.id + ']').text();
            errorMessages.push(errorField + ' ' + this.validationMessage);
        }
    });

    if (errorMessages.length > 0) {
        $.each(errorMessages, function (index, message) {
            $('#errorMessages').append($('<li>').attr({
                class: 'list-group-item list-group-item-danger'
            }).text(message));
        });
        // return true, indicating that there were errors
        return true;
    } else {
        // return false, indicating that there were no errors
        return false;
    }
}