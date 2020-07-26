$fb = new Facebook([
  'app_id' => '{your-app-id}',
  'app_secret' => '{your-app-secret}',
]);

$helper = $fb->getRedirectLoginHelper();

if (!isset($_SESSION['facebook_access_token'])) {
  $_SESSION['facebook_access_token'] = null;
}

if (!$_SESSION['facebook_access_token']) {
  $helper = $fb->getRedirectLoginHelper();
  try {
    $_SESSION['facebook_access_token'] = (string) $helper->getAccessToken();
  } catch(FacebookResponseException $e) {
    // When Graph returns an error
    echo 'Graph returned an error: ' . $e->getMessage();
    exit;
  } catch(FacebookSDKException $e) {
    // When validation fails or other local issues
    echo 'Facebook SDK returned an error: ' . $e->getMessage();
    exit;
  }
}

if ($_SESSION['facebook_access_token']) {
  echo "You are logged in!";
} else {
  $permissions = ['ads_management'];
  $loginUrl = $helper->getLoginUrl('http://localhost:8888/marketing-api/', $permissions);
  echo '<a href="' . $loginUrl . '">Log in with Facebook</a>';
}
