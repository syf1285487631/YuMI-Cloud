@echo off
echo.
echo [��Ϣ] ���΢������������ JAR ���ļ���
echo.

REM ���� Maven ����
call mvn clean package -Dmaven.test.skip=true

REM �л����ű�����Ŀ¼
cd /d %~dp0

REM ����Ŀ��Ŀ¼
set "TARGET_DIR=%cd%\package"

REM ����Ŀ��Ŀ¼����������ڵĻ���
if not exist "%TARGET_DIR%" mkdir "%TARGET_DIR%"

REM ��ӡ��ǰĿ¼
echo ��ǰĿ¼: %cd%

REM ��������Ŀ¼������ JAR �ļ�
for /r %%d in (target) do (
    if exist "%%d\*.jar" (
        echo ����Ŀ¼: %%d
        for %%f in ("%%d\*.jar") do (
            REM �ų����� yumi-common �� JAR �ļ�
            echo %%f | findstr /i "yumi-common" >nul
            if errorlevel 1 (
                echo Moving %%f
                move "%%f" "%TARGET_DIR%"
            ) else (
                echo Skipping %%f
            )
        )
    )
)

pause
