-- INSERT INTO GENRE (Gen_ID, Name) VALUES (0, 'Blues');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (1, 'Classical');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (2, 'Country');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (3, 'Electronic');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (4, 'Folk');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (5, 'Jazz');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (6, 'New age');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (7, 'Reggae');
-- INSERT INTO GENRE (Gen_ID, Name) VALUES (8, 'Rock');

--
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (0, 'Classic Rock',8);
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (1, 'Alternative Rock',8);
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (2, 'Rock & Roll',8);
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (3, 'Chicago Blues',0);
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (4, 'Country Blues',0);
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (5, 'Avant-Garde',1);
-- INSERT INTO SUBGENRE (SUB_ID, Name, Genre_ID) VALUES (6, 'Chamber Music',1);



-- INSERT INTO MUSIC_SUBGENRES(SUB_ID,MUS_ID) VALUES (0,501218);

INSERT INTO MUSIC_VIDEO (id, Title, Album,Artist,Duration,Release_Year, Genre)VALUES (501218,'Walk With Me','Le Noise','Neil Young',247,2010,'Rock');
-- INSERT INTO  subgenres_helper (id, Sub_name) VALUES (501218, 'Classic Rock');
-- INSERT INTO  subgenres_helper (id, Sub_name) VALUES (501218, 'Punk Rock');
-- INSERT INTO  subgenres_helper (id, Sub_name) VALUES (501218, 'Alternative Rock');

INSERT INTO MUSIC_VIDEO (id, Title, Album,Artist,Duration,Release_Year, Genre)VALUES (501219,'Cheek to cheek','Le Noise','Ella Fitzgerald',247,2010,'Blues');
-- INSERT INTO  subgenres_helper (id, Sub_name) VALUES (501219, 'Chicago Blues');
-- INSERT INTO  subgenres_helper (id, Sub_name) VALUES (501219, 'Country Blues');
INSERT INTO  MUSIC_VIDEO_SUBGENRES (MUSIC_VIDEO_ID, SUBGENRES) VALUES (501219, 'Country Blues');
INSERT INTO  MUSIC_VIDEO_SUBGENRES (MUSIC_VIDEO_ID, SUBGENRES) VALUES (501219, 'Chicago Blues');

