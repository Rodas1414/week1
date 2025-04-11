<?php

ob_start();

$name = '';
$email = '';
$gender = '';
$wines = '';
$gender = '';
$regions = '';
$comments = '';

if($_SERVER['REQUEST_METHOD'] == 'POST') {

if(isset($_POST['name'],
$_POST['email'],
$_POST['gender'],
$_POST['wines'],
$_POST['regions'],
$_POST['comments'])) {

$name = $_POST['name'];
$email = $_POST['email'];
$gender = $_POST['gender'];
$wines = $_POST['wines'];
$regions = $_POST['regions'];
$comments = $_POST['comments'];

function my_wines($wines) {
$my_return = '';
if(!empty($_POST['wines'])) {
$my_return = implode(', ', $_POST['wines']);
}
return $my_return;
}


$to = 'Rodas.Gebreyohannes@Seattlecollege.edu';
$subject = 'Test Email on ' .date('m/d/y, h i A');
$body = '
Name : '.$name.'  '.PHP_EOL.'
Email : '.$email.'  '.PHP_EOL.'
Gender : '.$gender.'  '.PHP_EOL.'
Region : '.$regions.'  '.PHP_EOL.'
Wines : '.my_wines($wines).'  '.PHP_EOL.'   
Comments : '.$comments.'  '.PHP_EOL.'
';

$headers = array(
'From' => 'noreply@mystudentswa.com'  
);

if(!empty($name && $email && $gender && $wines && $regions && $comments)) {

mail($to, $subject, $body, $headers);
header('Location:sumbit.html');

}


}



}