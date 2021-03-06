DROP TABLE IF EXISTS ankiety_lekarze CASCADE;
DROP TABLE IF EXISTS skierowania CASCADE;
DROP TABLE IF EXISTS historia_medyczna CASCADE;
DROP TABLE IF EXISTS wydarzenia_medyczne CASCADE;
DROP TABLE IF EXISTS wizyty_planowane CASCADE;
DROP TABLE IF EXISTS wizyty_odbyte CASCADE;
DROP TABLE IF EXISTS cele_wizyty CASCADE;
DROP TABLE IF EXISTS pracownicy_role CASCADE;
DROP TABLE IF EXISTS role CASCADE;
DROP TABLE IF EXISTS pacjenci_lpk CASCADE;
DROP TABLE IF EXISTS lekarze_specjalizacje CASCADE;
DROP TABLE IF EXISTS specjalizacje CASCADE;
DROP TABLE IF EXISTS pracownicy CASCADE;
DROP TABLE IF EXISTS pacjenci CASCADE;
DROP VIEW IF EXISTS terminarz;
DROP FUNCTION IF EXISTS wizyte_odbyte_pacjenta(INTEGER);
DROP FUNCTION IF EXISTS wizyte_planowane_pacjenta(INTEGER);
DROP FUNCTION IF EXISTS czy_aktywny_lekarz(INTEGER, DATE, DATE);
DROP FUNCTION IF EXISTS lekarze_specjalizacje_check();
DROP FUNCTION IF EXISTS pacjent_check();
DROP FUNCTION IF EXISTS pesel_check(CHAR);
DROP FUNCTION IF EXISTS pacjent_lpk_check();
DROP FUNCTION IF EXISTS pracownik_check();
DROP FUNCTION IF EXISTS ranking(DATE, DATE);
DROP FUNCTION IF EXISTS ranking_alfabetyczny(DATE, DATE);
DROP FUNCTION IF EXISTS ranking_cecha(DATE, DATE, VARCHAR);
DROP FUNCTION IF EXISTS ranking_specjalizacje(DATE, DATE, INTEGER);
DROP FUNCTION IF EXISTS role_pracownika(INTEGER);
DROP FUNCTION IF EXISTS terminarz_insert();
DROP FUNCTION IF EXISTS specjalizacje_lekarza(INTEGER);
DROP FUNCTION IF EXISTS wizyta_odbyta_check();
DROP FUNCTION IF EXISTS wizyta_planowana_check();
DROP FUNCTION IF EXISTS nulls(ANYARRAY);
DROP FUNCTION IF EXISTS ankiety_check();
DROP FUNCTION IF EXISTS lrul();
DROP FUNCTION IF EXISTS historia_check();
DROP FUNCTION IF EXISTS pracownicy_role_check();
DROP FUNCTION IF EXISTS lekarze_specjalizacje_check();