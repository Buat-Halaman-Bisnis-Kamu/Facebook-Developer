define(['facebook'], function(){
  FB.init({
    appId      : '{701909577290417}',
    version    : 'v8.0'
  });
  FB.getLoginStatus(function(response) {
    console.log(response);
  });
});
