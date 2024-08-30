#!/bin/bash

# 定义备份文件的路径和名称
BACKUP_DIR="/opt/project/flowlz/dingxi/backage"
BACKUP_FILE="${BACKUP_DIR}/dx_$(date +%Y%m%d_%H%M%S).dump"

# 创建备份目录（如果不存在的话）
mkdir -p $BACKUP_DIR

# 执行备份命令
/opt/Kingbase/ES/V8/KESRealPro/V008R006C007B0024/ClientTools/bin/sys_dump -U FLOWLZDX -p 54321 -d FLOWLZDX -Fc > $BACKUP_FILE


0 23 * * * /opt/project/flowlz/dingxi/backage/dxbackup.sh

30 23 * * * /opt/project/flowlz/dingxipark/backage/backup.sh

/opt/Kingbase/ES/V8/KESRealPro/V008R006C007B0024/ClientTools/bin/sys_restore -U FLOWLZDX -p 54321 -d test -v /opt/project/flowlz/dingxi/backage/dx_20240830_153036.dump