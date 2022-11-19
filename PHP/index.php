<?php
require_once('Account.php');
require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');

$uberX = new UberX("CVB123",new Account("Andres Herrera","AND456"),"Chevrolet","Spark");

$uberPool = new UberPool("TYU567",new Account("Andrea Ferran","ANDA765"),"Dodge","Attitude");

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>POO en PHP</title>
</head>
<body>
    <h1>Clases y Objetos en PHP</h1>
    <h3>Objeto Car</h3>
    <p>
        <?php 
        $uberX->printDataCar(); 
        $uberPool->printDataCar();

        ?>
    </p>
</body>
</html>