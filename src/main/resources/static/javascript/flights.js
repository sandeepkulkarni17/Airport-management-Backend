document.addEventListener('DOMContentLoaded', function () {
    const flightForm = document.getElementById('flight-form');
    const flightsTable = document.getElementById('flights-table').getElementsByTagName('tbody')[0];

    flightForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const flightNumber = document.getElementById('flightNumber').value;
        const departure = document.getElementById('departure').value;
        const destination = document.getElementById('destination').value;
        const departureTime = document.getElementById('departureTime').value;
        const arrivalTime = document.getElementById('arrivalTime').value;

        // Insert flight data into the table
        const row = flightsTable.insertRow();
        row.insertCell(0).innerText = flightNumber;
        row.insertCell(1).innerText = departure;
        row.insertCell(2).innerText = destination;
        row.insertCell(3).innerText = departureTime;
        row.insertCell(4).innerText = arrivalTime;

        const actionsCell = row.insertCell(5);
        const deleteButton = document.createElement('button');
        deleteButton.className = 'btn btn-danger';
        deleteButton.innerText = 'Delete';
        deleteButton.addEventListener('click', function () {
            flightsTable.deleteRow(row.rowIndex - 1);
        });
        actionsCell.appendChild(deleteButton);

        // Clear the form
        flightForm.reset();
    });
});
