# Food Panda YouTube Ad Blocker

## Overview
Food Panda YouTube Ad Blocker is a Chrome extension that blocks Food Panda-related ads on YouTube, providing a cleaner and smoother viewing experience. It works by intercepting the requests to Food Panda's ads and blocking them from loading.

## Features
- Blocks Food Panda-related ads on YouTube.
- Provides a seamless ad-free viewing experience on YouTube.
- Works on desktop Chrome browsers.
  
## Installation Instructions

1. **Download the Extension Files**
   - Clone or download the repository containing the extension files.

2. **Load the Extension in Chrome:**
   - Open Chrome and go to `chrome://extensions/`.
   - Enable **Developer mode** (toggle in the top-right corner).
   - Click on **"Load unpacked"** and select the folder where you have the extension files.
   - The extension should now be added to Chrome.

3. **Test the Extension:**
   - Visit YouTube and watch a video that might have Food Panda ads.
   - You should see the ads being blocked automatically.

## Permissions
This extension requires the following permissions:
- **declarativeNetRequest**: To block ads based on predefined rules.
- **storage**: To save settings or any necessary data.
  
## How It Works
- The extension uses the `declarativeNetRequest` API to block network requests from Food Panda's domains.
- Ads from **foodpanda.com** are intercepted and blocked before they can load.
  
## How to Modify
- If you'd like to add or modify the ad-blocking rules, open the `rules.json` file and update the **URL filters** or other conditions as necessary.
  
## Contributions
Feel free to contribute by forking this repository and making pull requests with improvements, bug fixes, or new features!

## License
This project is open-source and licensed under the MIT License.

## Issues or Feedback?
If you encounter any issues or have feedback, please create an issue or contact me directly via the project page.
