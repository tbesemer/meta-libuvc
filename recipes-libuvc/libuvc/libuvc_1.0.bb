
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
PR = "r0"

SRC_URI = "git://github.com/ktossell/libuvc;rev=29eaadf98f6e499ab863516075a05802c53c58c6"

DEPENDS = "libjpeg-turbo libusb1"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${base_libdir}
    install -m 0755 libuvc.so ${D}${base_libdir}
}

FILES_${PN} += "${base_libdir}"
FILES_${PN}-dbg += "${base_libdir}/.debug"
FILES_SOLIBSDEV = ""
