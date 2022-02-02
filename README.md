# AppLovin MAX SDK

## Overview
MAX is AppLovin's in-app monetization solution.

Move beyond the traditional monetization solution and integrate MAX. MAX is a single unbiased auction where advertisers get equal access to all ad inventory and bid simultaneously, which drives more competition and higher CPMs for you. You can read more about it [here](https://www.applovin.com/max-header-bidding).

Please check out AppLovin [documentation](https://dash.applovin.com/documentation/mediation/android/getting-started) to get started on integrating and enabling mediated networks using our guides.

## Demo Videos
To get started with the demo app, follow the instructions below:

1. Banner Ads: https://youtu.be/yE2HmVygjFM
2. Interstitial Ads: https://youtu.be/gdbglhgvEYs
3. Native Ads: https://youtu.be/WmHEWj9e59w
4. MREC(medium rectangle) Ads: https://youtu.be/yFshr78b74Q
5. Bidding / Mediation:
<img src="https://user-images.githubusercontent.com/35604864/151718441-39175ec1-3d4f-4daa-be90-5b71857309f2.jpg" width="350" height="700" /> 


## Error Codes
| Code          | Description   |
| ------------- |:-------------:|
| -1            | Indicates an unspecified error with one of the mediated network SDKs. |
| 204           | Indicates that no ads are currently eligible for your device. |
| -102          | Indicates that the ad request timed out (usually due to poor connectivity). |
| -103          | Indicates that the device is not connected to the internet (e.g. airplane mode). |
| -2051         | Indicates that the device is not connected to a VPN or the VPN connection is not working properly (Users in China Only). |
| -5001         | Indicates that the ad failed to load due to various reasons (such as no networks being able to fill). |
| -5201         | Indicates an internal state error with the AppLovin MAX SDK. |
| -5601         | Indicates the provided `Activity` instance has been garbage collected while the AppLovin MAX SDK attempts to re-load an expired ad. |

## Support
We recommend using GitHub to file issues. For feature requests, improvements, questions or any other integration issues using MAX Mediation by AppLovin, contact me via Facebook (https://m.facebook.com/tariqmahmoodrana786) or YouTube (https://www.youtube.com/codetrix786).
