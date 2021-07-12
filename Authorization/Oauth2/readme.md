Oauth2 Summary

1) Oauth2 is an industry-standard protocol for authorization, which basically means that it checks if you,  the user, have access to a resource with your user level.

2) Password grant verifies the identity through a username and password. The server returns the JavaScript Web Token (JWT), if the data provided is correct.

3) The Authorization Code grant type is used by confidential and public clients to exchange an authorization code for an access token. The authorization server responds with a JSON object that contains the following properties:
    1) token_type
    2) expires_in
    3) access_token
    4) refresh_token

4) A Refresh token can be used to request a new access token without the user being redirected.

5) Cross-origin Resource Sharing (CORS) policies can be used for JavaScript and XML HTTP Request (XHR) requests for the client-side. A filter needs to be created on the authorization server that sets the CORS policies for every request.
