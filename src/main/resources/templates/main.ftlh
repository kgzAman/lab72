<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>

    <form id="from" action="/" method="post">
        <label for="user"></label><input id="user" type="text" name="user" placeholder="add name" min="5">
        <label for="text"></label><input id="text" type="text" name="massage" placeholder="add text">
        <button id="btn" type="submit">send</button>
    </form>
        <#if massage??>
            <#list massage as mass>
        <div >
            <li id="list">
                ${mass.name}
                ${mass.text}
                ${mass.localDateTime}
            </li>
        </div>
            </#list>
    </div>
        </#if>

    <script>
        document.getElementById("from").addEventListener('submit',async function f(e) {
            e.preventDefault()
            alert('page did not reload');
            console.log('print me ')
            await fetch('http://localhost:2020/',{
                method: 'post',
                body: new FormData(this)
            });
            await new Promise(resolve => setTimeout(resolve, 3000))
            location.reload();
        })
</script>
</body>
</html>