  
const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const loginErrorMsg = document.getElementById("login-error-msg");

// When the login button is clicked, the following code is executed
loginButton.addEventListener("click", (e) => {
    // Prevent the default submission of the form
    e.preventDefault();
    // Get the values input by the user in the form fields
    const username = loginForm.username.value;
    const password = loginForm.password.value;

    if (username === "user" && password === "web") {
        // If the credentials are valid, show an alert box and reload the page
        //alert("You have successfully logged in.");
        
        location.href = "http://127.0.0.1:5500/NiceAdmin/form_component.html";
        
        //location.reload();
    } 
    else if (username === "departmentSupervisor" && password === "web") {
        // If the credentials are valid, show an alert box and reload the page
        //alert("You have successfully logged in.");
        
        location.href = "http://127.0.0.1:5500/NiceAdmin/DSform_component.html";
        
        //location.reload();
    }
    else if (username === "departmentHead" && password === "web") {
        // If the credentials are valid, show an alert box and reload the page
        //alert("You have successfully logged in.");
        
        location.href = "http://127.0.0.1:5500/NiceAdmin/DHform_component.html";
        
        //location.reload();
    }
    else if (username === "benefitsCoordinator" && password === "web") {
        // If the credentials are valid, show an alert box and reload the page
        //alert("You have successfully logged in.");
        
        location.href = "http://127.0.0.1:5500/NiceAdmin/BCform_component.html";
        
        //location.reload();
    }
    else {
        // Otherwise, make the login error message show (change its oppacity)
        loginErrorMsg.style.opacity = 1;
    }
})