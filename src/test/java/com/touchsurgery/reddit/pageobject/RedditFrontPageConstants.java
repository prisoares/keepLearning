package com.touchsurgery.reddit.pageobject;

public interface RedditFrontPageConstants {

  String TS_USERNAME = "username.touchsurgery";

  String TS_PASSWORD = "password.touchsurgery";

  String FRAMEWORK_PROPERTIES = "framework.properties";

  String SKIP_LOGIN_FOR_NOW_XPATH = "//*[@id=\"desktop-onboarding-sign-up-form\"]/p[2]/a[2]";

  String SEARCH_TEXTBOX_NAME = "q";

  String SEARCH_SUBMIT_BUTTON_XPATH = "//*[@id=\"search\"]/input[2]";

  String FIRST_SUBREDDITS_XPATH = "/html/body/div[6]/div[2]/div/div/div[1]/header/a";

  String TOP_POSTS_TAB_XPATH = "//*[@id=\"header-bottom-left\"]/ul/li[5]/a";

  String THE_MOST_UPVOTED_POST_XPATH = "//*[@id=\"siteTable\"]/div[1]/div[2]/div[1]/p[1]/a";

  String USERNAME_FIELD_NAME = "user";

  String PASSWORD_FIELD_NAME = "passwd";

  String SUBMIT_LOGIN_BUTTON_XPATH = "//*[@id=\"login_login-main\"]/div[4]/button";

}
