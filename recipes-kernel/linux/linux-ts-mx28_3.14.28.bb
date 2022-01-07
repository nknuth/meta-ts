# adapted from linux-imx.inc, copyright (C) 2012-2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for TS IMX28 Boards"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

# Put a local version until we have a true SRCREV to point to
LOCALVERSION ?= "+yocto"

SRCBRANCH ??= "master"
SRC_URI = "git://github.com/embeddedTS/linux-3.14.28-imx28.git;branch=${SRCBRANCH} \
           file://defconfig"

DEPENDS += "lzop-native bc-native"
SRCREV = "6df506697aeead7cfe7db80a9730d97692315d36"
LOCALVERSION = "-1.1.0-technologic"

COMPATIBLE_MACHINE = "(mx28)"
COMPATIBLE_MACHINE = "(tsmx28)"
