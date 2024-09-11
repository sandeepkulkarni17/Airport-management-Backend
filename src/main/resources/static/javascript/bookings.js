document.addEventListener('DOMContentLoaded', function () {
    const bookingForm = document.getElementById('booking-form');
    const bookingsTable = document.getElementById('bookings-table').getElementsByTagName('tbody')[0];

    bookingForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const passengerName = document.getElementById('passengerName').value;
        const flightNumber = document.getElementById('flightNumber').value;
        const bookingDate = new Date().toLocaleString();

        // Insert booking data into the table
        const row = bookingsTable.insertRow();
        row.insertCell(0).innerText = bookingsTable.rows.length + 1;
        row.insertCell(1).innerText = passengerName;
        row.insertCell(2).innerText = flightNumber;
        row.insertCell(3).innerText = bookingDate;

        const actionsCell = row.insertCell(4);
        const deleteButton = document.createElement('button');
        deleteButton.className = 'btn btn-danger';
        deleteButton.innerText = 'Delete';
        deleteButton.addEventListener('click', function () {
            bookingsTable.deleteRow(row.rowIndex - 1);
        });
        actionsCell.appendChild(deleteButton);

        // Clear the form
        bookingForm.reset();
    });
});
