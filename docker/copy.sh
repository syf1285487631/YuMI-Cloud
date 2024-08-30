#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20231130.sql ./mysql/db
cp ../sql/ry_config_20231204.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../yumi-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy yumi-gateway "
cp ../yumi-gateway/target/yumi-gateway.jar ./yumi/gateway/jar

echo "begin copy yumi-auth "
cp ../yumi-auth/target/yumi-auth.jar ./yumi/auth/jar

echo "begin copy yumi-visual "
cp ../yumi-visual/yumi-monitor/target/yumi-visual-monitor.jar  ./yumi/visual/monitor/jar

echo "begin copy yumi-modules-system "
cp ../yumi-modules/yumi-system/target/yumi-modules-system.jar ./yumi/modules/system/jar

echo "begin copy yumi-modules-file "
cp ../yumi-modules/yumi-file/target/yumi-modules-file.jar ./yumi/modules/file/jar

echo "begin copy yumi-modules-job "
cp ../yumi-modules/yumi-job/target/yumi-modules-job.jar ./yumi/modules/job/jar

echo "begin copy yumi-modules-gen "
cp ../yumi-modules/yumi-gen/target/yumi-modules-gen.jar ./yumi/modules/gen/jar

