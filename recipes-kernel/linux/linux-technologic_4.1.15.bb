# adapted from linux-imx.inc, copyright (C) 2012-2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for TS IMX6 Boards"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
SRC_URI = "git://github.com/embeddedarm/linux-3.10.17-imx6.git;branch=${SRCBRANCH} \
           file://defconfig"
DEPENDS += "lzop-native bc-native"
SRCREV = "96f10e6cc64be0f5bf8f1f7d5734366facabc33a"
LOCALVERSION = "-1.1.0-technologic"

COMPATIBLE_MACHINE = "(tsimx6)"