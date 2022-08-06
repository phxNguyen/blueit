INSERT INTO link (id,creation_date,last_modified_date,created_by,last_modified_by,title,url)
VALUES (1,NOW(),NOW(),null,null,'Java Subreddit','https://www.reddit.com/r/java/');

INSERT INTO comment
(id,created_by,creation_date,last_modified_by,last_modified_date,body,link_id)
VALUES
    (1,null,NOW(),null,NOW(),'today is a good day to die',1);