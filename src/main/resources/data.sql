
INSERT INTO link (id,creation_date,last_modified_date,created_by,last_modified_by,title,url)
VALUES (1,NOW(),NOW(),null,null,'Java Subreddit','https://www.reddit.com/r/java/'),
       (2,NOW(),NOW(),null,null,'Mildlyinfuriating Subreddit','https://www.reddit.com/r/mildlyinfuriating/'),
       (3,NOW(),NOW(),null,null,'Unexpected Subreddit','https://www.reddit.com/r/askscience/'),
       (4,NOW(),NOW(),null,null,'Askscience Subreddit','https://www.reddit.com/r/java/'),
       (5,NOW(),NOW(),null,null,'Baking Subreddit','https://www.reddit.com/r/Baking/'),
       (6,NOW(),NOW(),null,null,'Budgetfood Subreddit','https://www.reddit.com/r/budgetfood/'),
       (7,NOW(),NOW(),null,null,'Cocktails Subreddit','https://www.reddit.com/r/cocktails/'),
       (8,NOW(),NOW(),null,null,'Food Subreddit','https://www.reddit.com/r/food/'),
       (9,NOW(),NOW(),null,null,'Music Subreddit','https://www.reddit.com/r/Music/'),
       (10,NOW(),NOW(),null,null,'Nextfuckinglevel Subreddit','https://www.reddit.com/r/nextfuckinglevel/'),
       (11,NOW(),NOW(),null,null,'WatchPeopleDieInside Subreddit','https://www.reddit.com/r/WatchPeopleDieInside/'),
       (12,NOW(),NOW(),null,null,'Vegetarian Subreddit','https://www.reddit.com/r/vegetarian/')
;

INSERT INTO comment
(id,created_by,creation_date,last_modified_by,last_modified_date,body,link_id)
VALUES
    (1,null,NOW(),null,NOW(),'today is a good day to die',1);