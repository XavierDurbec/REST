ALTER TABLE NOTE DROP CONSTRAINT FK_NOTE_ITEM_ID
ALTER TABLE LIVRE DROP CONSTRAINT FK_LIVRE_ID
ALTER TABLE FILM DROP CONSTRAINT FK_FILM_ID
ALTER TABLE UTILISATEUR_NOTE DROP CONSTRAINT FK_UTILISATEUR_NOTE_Utilisateur_ID
ALTER TABLE UTILISATEUR_NOTE DROP CONSTRAINT FK_UTILISATEUR_NOTE_ListeNote_ID
DROP TABLE ENTITE
DROP TABLE UTILISATEUR
DROP TABLE NOTE
DROP TABLE ITEM
DROP TABLE LIVRE
DROP TABLE FILM
DROP TABLE UTILISATEUR_NOTE
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'
