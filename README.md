# Configure AOSP

## Get the AOSP
> repo init -u https://android.googlesource.com/platform/manifest -b android-12.1.0_r6 \
> repo sync -j8 \
> bash

## Build the Car emulator
> source build/envsetup.sh \
> lunch (enter number of sdk_car_x86_64-userdebug) \
> m

Launch to make sure it works fine
> emulator -cores 4 -memory 6144 -no-snapshot
![emulator](https://github.com/pitileda/HelloService/assets/65466220/34e17f66-3974-41a5-89de-e0d921fbbee4)
***
# Add HelloService

## Clone current repo

Create new folder in the root of AOSP
> mkdir -p vendor/ihor/packages/HelloSystem \
> git clone ..

## Update emulator target

Add next lines into device/generic/goldfish/car/sdk_car_x86_64.mk
> PRODUCT_PACKAGES += \ \
>   HelloService

## Rebuild target with current service
> m \
> m com.ihor.helloservice.lib.stubs.source-update-current-api (in case of api error)

***
# How to

## generate project from AOSP folder
> aidegen -n vendor/ihor/packages/HelloSystem
