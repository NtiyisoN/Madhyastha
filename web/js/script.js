var ws;

function connect() {
    var username = document.getElementById("username").value;
    ws = new WebSocket("ws://" + document.location.host + "/chat-websocket-application/chat/" + username);

    
    
    
    ws.onmessage = function(event) {
    var log = document.getElementById("log");
        console.log(event.data);
        var message = JSON.parse(event.data);
        log.innerHTML += message.from + " : " + message.content + "\n";
    };
}

function send() {
    
   var content = document.getElementById("msg").value;
   /* var url = window.location.href;
    var value = 'number=';
    var hash = url.indexOf(value);
    var to = url.substring(hash + value.length, url.length);*/
    var to = document.getElementById("to").value;
    
    
    
    
    
    var json = JSON.stringify({
        "to":to,
        "content":content
    });

    ws.send(json);
    log.innerHTML += "Me : " + content + "\n";
}