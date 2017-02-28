@echo off

REM Get the local date. Source: http://stackoverflow.com/questions/203090/how-to-get-current-datetime-on-windows-command-line-in-a-suitable-format-for-us
for /F "usebackq tokens=1,2 delims==" %%i in (`wmic os get LocalDateTime /VALUE 2^>NUL`) do if '.%%i.'=='.LocalDateTime.' set ldt=%%j
set ldt=%ldt:~0,4%-%ldt:~4,2%-%ldt:~6,2%_%ldt:~8,2%%ldt:~10,2%%ldt:~12,6%

set YAMAICA_HOME=%cd%\..\..\..\..\..\..\ascgit048.yamaica-config\de.bmw.yamaica.ea.product\target\products\de.bmw.yamaica.ea.product\win32\win32\x86
set TARGET_DIR_EA=%cd%\EA_MasterCatalog.eap

REM TODO! Must be set!
set FRANCA_DIR=%cd%\..\changing_test\#0

set TARGET_DIR=%cd%\Target\y20\%ldt%
set FOLDER_NAME=EA2Franca
set TARGET_DIR_FRANCA_1=%TARGET_DIR%\%FOLDER_NAME%\1
set TARGET_DIR_FRANCA_2=%TARGET_DIR%\%FOLDER_NAME%\2
set TARGET_DIR_FRANCA_3=%TARGET_DIR%\%FOLDER_NAME%\3

REM EA nodepath of the series development master catalog for SP2018
set EA_ROOT_PACKAGE=de.bmw
set EAP_MYNODEPATH="myCatalog.Catalog"

cd %YAMAICA_HOME%

REM Step 1: Franca -> EA (myfile: empty containing Master Catalog only)
yamaicac.exe -e %TARGET_DIR_EA% -efp %FRANCA_DIR% -erp %EA_ROOT_PACKAGE% -nv

REM Step 2: EA (myfile) -> Franca
yamaicac.exe -e %TARGET_DIR_EA% -edp %TARGET_DIR_FRANCA_1% -enp %EAP_MYNODEPATH%

REM Step 3: Franca -> EA
yamaicac.exe -e %TARGET_DIR_EA% -efp %TARGET_DIR_FRANCA_1% -erp %EA_ROOT_PACKAGE% -nv

REM Step 4: EA (myfile) -> Franca
yamaicac.exe -e %TARGET_DIR_EA% -edp %TARGET_DIR_FRANCA_2% -enp %EAP_MYNODEPATH%

REM Step 5: Franca -> EA
yamaicac.exe -e %TARGET_DIR_EA% -efp %TARGET_DIR_FRANCA_2% -erp %EA_ROOT_PACKAGE% -nv

REM Step 6: EA -> Franca
yamaicac.exe -e %TARGET_DIR_EA% -edp %TARGET_DIR_FRANCA_3% -enp %EAP_MYNODEPATH%

pause