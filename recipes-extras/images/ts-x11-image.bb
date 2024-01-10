SUMMARY = "TS X11 Image"

IMAGE_FEATURES += "x11-base debug-tweaks package-management ssh-server-openssh tools-debug nfs-client qtcreator-debug tools-sdk"

# Some of these packages have found new homes in
#
#  meta-imx/meta-sdk/dynamic-layers/qt6-layer/recipes-qt/examples
#
# ...however, adding that layer requires the NXP EULA to be signed.
# Commenting these packages out for now.
# 
# 	cinematicexperience
#	qt5-opengles2-test 
#	qtquickcontrols-qmlplugins
#	qtquickcontrols2
# 	qtscript 
#	qtwebkit

IMAGE_INSTALL:append = " \
	packagegroup-core-boot \
	packagegroup-core-buildessential \
	packagegroup-core-full-cmdline \
	packagegroup-machine-base \
	packagegroup-qt6-essentials \
	alsa-utils-alsactl \
	alsa-utils-alsamixer \
	alsa-utils-amixer \
	alsa-utils-aplay \
	alsa-utils-speakertest \
	bash-completion \
	boost \
	canutils \
	clutter-1.0-examples \
	curl \
	devmem2 \
	e2fsprogs \
	espeak \
	fbgrab \
	fbset \
	fontconfig-utils \
	freetype \
	git \
	gstreamer1.0 \
	gstreamer1.0-meta-base \
	gstreamer1.0-plugins-base \
	gstreamer1.0-plugins-bad \
	gstreamer1.0-plugins-good \
	gtk+3-demo \
	hexedit \
	hostapd \
	i2c-tools \
	imagemagick \
	iotop \
	iperf2 \
	iperf3 \
	iw \
	ldd \
	liberation-fonts \
	libmodbus \
	libsocketcan \
	libusb1 \
	lighttpd-module-cgi \
	linux-firmware \
	lsof \
	matchbox-keyboard \
	matchbox-terminal \
	matchbox-wm \
	mesa-demos \
	modemmanager \
	nano \
	nfs-utils \
	nodejs \
	openssh-sftp \
	openssh-sftp-server \
	picocom \
	ppp \
	python3 \
	qtbase \
	qtbase-plugins \
	qtbase-tools \
	qtcharts \
	qtmultimedia \
	qtmultimedia-plugins \
	qtmultimedia-qmlplugins \
	qtsensors \
	qtserialbus \
	qtserialport \
	qtvirtualkeyboard \
	rsync \
	sqlite3 \
	tcpdump \
	ttf-bitstream-vera \
	ttf-dejavu-common \
	ttf-dejavu-sans \
	ttf-dejavu-sans-mono \
	tzdata \
	usb-modeswitch \
	usbutils \
	util-linux-mkfs \
	wpa-supplicant \
	xcursor-transparent-theme \
	xinput-calibrator \
	xterm "

EXTRA_IMAGEDEPENDS += "qemu-native qemu-helper-native"

LICENSE = "MIT"

inherit core-image 
