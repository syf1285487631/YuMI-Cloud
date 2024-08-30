@echo off
echo.
echo [信息] 打包微服务，生成所有 JAR 包文件。
echo.

REM 调用 Maven 构建
call mvn clean package -Dmaven.test.skip=true

REM 切换到脚本所在目录
cd /d %~dp0

REM 定义目标目录
set "TARGET_DIR=%cd%\package"

REM 创建目标目录（如果不存在的话）
if not exist "%TARGET_DIR%" mkdir "%TARGET_DIR%"

REM 打印当前目录
echo 当前目录: %cd%

REM 遍历所有目录并查找 JAR 文件
for /r %%d in (target) do (
    if exist "%%d\*.jar" (
        echo 查找目录: %%d
        for %%f in ("%%d\*.jar") do (
            REM 排除包含 yumi-common 的 JAR 文件
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
