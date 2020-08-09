- project/
   - index.html
   - scripts/
      - main.js
      - require.js
- fb.js
require.config({
  shim: {
    'facebook' : {
      exports: 'FB'
    }
  },
  paths: {
    'facebook': 'https://connect.facebook.net/en_US/sdk.js'
  }
})
require(['fb']);
