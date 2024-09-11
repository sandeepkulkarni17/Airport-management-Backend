document.addEventListener('DOMContentLoaded', function () {
    const userForm = document.getElementById('user-form');
    const usersTable = document.getElementById('users-table').getElementsByTagName('tbody')[0];

    userForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const username = document.getElementById('username').value;
        const role = document.getElementById('role').value;

        // Insert user data into the table
        const row = usersTable.insertRow();
        row.insertCell(0).innerText = usersTable.rows.length + 1;
        row.insertCell(1).innerText = username;
        row.insertCell(2).innerText = role;

        const actionsCell = row.insertCell(3);
        const deleteButton = document.createElement('button');
        deleteButton.className = 'btn btn-danger';
        deleteButton.innerText = 'Delete';
        deleteButton.addEventListener('click', function () {
            usersTable.deleteRow(row.rowIndex - 1);
        });
        actionsCell.appendChild(deleteButton);

        // Clear the form
        userForm.reset();
    });
});
