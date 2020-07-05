<h1> Meminta Token Akses Aset Bisnis </h1> 
<p> Anda dapat meminta Token Akses Aset Bisnis dari siapa saja yang menggunakan integrasi Login Facebook Anda. </p> 

<h2> Menggunakan FB.login () </h2> 
<p> Contoh ini menambahkan beberapa izin tambahan ke fungsi login dasar yang ditunjukkan dalam contoh sebelumnya: </p>
<a href="#"id="login-btn">Meminta Token Akses Aset Bisnis</a> 

<script> document.getElementById ('login-btn'). onclick = function () { FB.login (fungsi (respons) { Log.info ('FB.login response', response); }, {asset_scope: 'pages_messaging'}); return false; } </script> 

<h2> Menggunakan Tombol Masuk </h2> 
<p> Anda juga dapat menggunakan<a href="https://developers.facebook.com/docs/plugins/login-button/">Plugin sosial Tombol Masuk</a>untuk meminta izin tambahan:</p> 

<div class = "fb-login-button" data-asset-scope ="pages_messaging"data-max-rows ="1"data-size ="medium"></div> 

<h3> Panduan Terkait </h3> 
<p>Baca<a href="https://developers.facebook.com/docs/facebook-login/login-flow-for-web/">panduan kami untuk menggunakan JavaScript SDK untuk Login Facebook</a>untuk lihat cara terbaik untuk menggunakan Login Facebook. </p>
