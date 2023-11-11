<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>BuySell</title>
</head>
<body>
<h1>BuySell</h1>
<hr>
<h3>Подробная информация о товаре</h3>
<b>Название товара: </b>${product.title}<br>
<b>Описание товара: </b>${product.description}<br>
<b>Цена: </b>${product.price}<br>
<b>Город: </b>${product.city}<br>
<b>Автор: </b>${product.author}<br>

<hr>
<a href="/">Назад к каталогу</a>
<hr>
<h3>Удалить товар:</h3>
<form action="/product/delete/${product.id}" method="post">

    <input type="submit" value="Подтвердить">
</form>
</body>
</html>