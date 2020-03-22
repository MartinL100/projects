
function getjson(url) {

    var request = new XMLHttpRequest();

    request.open("get", url);
    request.send(null);

    request.onload = function () {
        var jsonStr = JSON.parse(request.responseText);
        return jsonStr;
    }
}
