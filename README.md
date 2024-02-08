# Confogure AOSP

## Get AOSP
> repo init -u https://android.googlesource.com/platform/manifest -b android-12.1.0_r6 \
> repo sync -j8 \
> bash

## Build Car emulator
> source build/envsetup.sh \
> lunch (enter number of sdk_car_x86_64-userdebug) \
> m

Launch to make sure it works fine
> emulator -cores 4 -memory 6144 -no-snapshot
