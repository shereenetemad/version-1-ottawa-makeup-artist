document.getElementById('bookingForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const service = document.getElementById('service').value;

    console.log(`Booking Details: Name: ${name}, Email: ${email}, Service: ${service}`);
    alert('Thank you for booking!');
});
