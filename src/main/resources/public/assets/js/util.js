//  data => {"obj": "123"}
function send(url, method, data, callback){
	$.ajax({
        url: url,
        type: method,
        data: data,
        success: function(data) {
    		callback(data);
        },
        error:function(response) {
        	alert("System Error!");
        }
    });
}