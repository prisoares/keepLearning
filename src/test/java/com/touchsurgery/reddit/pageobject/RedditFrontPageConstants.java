package com.touchsurgery.reddit.pageobject;

public interface RedditFrontPageConstants {

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

  String DOWNVOTED_BUTTON_SECOND_TOP_POST_XPATH = "//*[@id=\"siteTable\"]/div[3]/div[1]/div[5]";

  String UPVOTED_BUTTON_SECOND_TOP_POST_XPATH = "//*[@id=\"siteTable\"]/div[3]/div[1]/div[1]";

  String CSS_CLASS_ATTRIBUTRE = "class";

  String DOWNVOTE_CSS_CLASS_NAME = "downmod";

  String UPVOTE_CSS_CLASS_NAME = "upmod";
  
  String LOGOUT_LINK_XPATH = "//*[@id=\"header-bottom-right\"]/form/a";

}
