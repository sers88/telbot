# telbot
The goal is to create a bot and start working with java (CI \ heroku)

Installation
-------------
1. Register on heroku and go to the console;
2. mvn clean install;
3. heroku login - after execution, you need to press any key and log in to the browser window that opens;
4. heroku create application name - create an application on heroku;
5. git push heroku master - push to the heroku repository;
6. heroku config: set BOT_NAME = bot name - add the bot name to the environment variables;
7. heroku config: set BOT_TOKEN = bot token - add the bot token to environment variables;
8. heroku config: get BOT_NAME (similar to BOT_TOKEN) - make sure the environment variables are set correctly;
9. heroku ps: scale worker = 1 - set the number of containers (dynos) for the worker process type (we previously selected this type in the Procfile), while the application is restarted;
10. In the application management interface in your personal account on heroku, go to the logs (hide under the 'More' button in the upper right corner) and make sure that the application is running;
11. We are testing the bot via Telegram.
