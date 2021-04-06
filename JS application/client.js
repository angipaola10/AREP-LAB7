app = (function (){
    
    const farenheitToCelsius = (farenheit) => {
        fetch(`https://vquhunaxyd.execute-api.us-east-1.amazonaws.com/celsius?fahrenheit=${farenheit}`)
            .then(res => {
                return res.json();
            })
            .catch( () => console.error("Error"))
                .then( res => {
                    document.getElementById("celsius").value = res.output;
                });
    }

    return {
        farenheitToCelsius: farenheitToCelsius
    }
})();