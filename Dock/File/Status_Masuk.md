<h1> Status Masuk </h1> 
<p> Contoh-contoh ini menunjukkan kepada Anda cara mengambil status masuk seseorang, dan melacak perubahan apa pun pada status itu. </p> 

<h2> Memeriksa Status Masuk </h2> 
<p> Fungsi <a href="https://developers.facebook.com/docs/reference/javascript/FB.getLoginStatus"> FB.getLoginStatus () </a> di SDK akan mengembalikan status login saat ini dari pengguna, dan contoh ini akan menunjukkan status respons dalam log (lihat entri 'Status Response'). </p> 

<script> FB.getLoginStatus (fungsi (respons) { Log.info ('Status Response', response); }); </script> 

<h2> Perubahan Status Pelacakan </h2> 
<p> Fungsi <a href="https://developers.facebook.com/docs/reference/javascript/FB.Event.subscribe/"> FB.Event.subscribe () </a> dapat digunakan untuk melacak auth.StatusChange acara yang akan memecat setiap kali status masuk pengguna berubah dengan cara apa pun. Coba gunakan tombol masuk di bawah ini untuk masuk, atau keluar dan lihat bagaimana setiap perubahan menyalakan suatu peristiwa (lihat entri 'Pergantian Status' dalam log): </p> 

<script> FB.Event.subscribe ('auth.statusChange', function (response) { Log.info ('Acara Perubahan Status', respons); }); </script> 
<div class = "fb-login-button" data-max-rows = "1" data-size = "medium" data-auto-logout-link = "true"> </div> 

<h3> Panduan Terkait </h3> 
<p> Baca <a href="https://developers.facebook.com/docs/facebook-login/login-flow-for-web/"> panduan kami untuk menggunakan JavaScript SDK untuk Login Facebook </a> untuk lihat cara terbaik untuk menggunakan Login Facebook. </p>
