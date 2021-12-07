# Java App Build in Jenkins Pipeline

Build jar from an java application named SB3T 

## Table of Contents
1. [Description](#Description)
2. [Dependencies](#Dependencies)
3. [Installing](#Dependencies)
4. [How to use it](#How-to-use-it)
5. [Author](#Author)
5. [Version-History](#Author)

## Description

Build .jar package from [Sb3t](https://github.com/Ozz007/sb3t) java application

## Getting Started

### Dependencies

* Windows/Linux
* Docker and Docker Compose (jenkins server)
* Port 80 free (Jenkins use :80, change if you need)

### Installing

To install the project you need to run
```sh
docker-compose up -d
```
> `docker-compose up` is for build the docker-compose.yml file.

> `-d` is needed if you don't want to be stuck in the container console logs.

### How to use it

To use this pipeline you need to connect to your [Jenkins](Localhost:8081) and find the job sb3t in CI folder.  
![Job](https://lh6.googleusercontent.com/2ZUezz0HSPh432dA4Q6qiqrEc-DqfT9-OKSYMnsZP-KVuIJNE3tk3fbf1f4i8TbSvmYNuGxM6T-OnCBKFI-x=w1879-h939-rw)


Then launch it with your parameters and wait until the build is finished...  
![Job](https://lh3.googleusercontent.com/fife/AAWUweXJosW9eJMzod0GrOYahUvf049pdDtT5c2x3VdmdX3-ZgJrBCNSJ5-Ltz6DRMm6uODLSrpAteaoqInTkoCu-7U4sQD0PJI5Mwu1lTJ1J9lZqO7luv2TiFtUyAIGQGRcFWWXzO5dSJ2-xSKT6AjyQvQZb_ONH_TUQMGIDyh50VHiKP_OBVm0rjPoa0MwYNkrxl6DyoSykDlVpziN5FMlI2n40HJf5m5KhMZyrdTbPDt5mu-6WS4GLs-4fc05ua84SzlG4OBbieEXRgXanqsy9P6HsXHHSpTkG_o6E8T35b8-vp94GZbETcMIT04HidQ_o36mnO7IcMriSWZ5hYErbEYSGD_WnelUZFV1T9XryQBeyydUkKhWjLm-x9b_g3HNU2gw48tCrrPVsJT1r61BmNd-13xxwSSUyxR-8WfH1KTLsxywfwM5ReH2ruzFslRYqddGiv1nSN2NsLWMrzWCaMlNa1zo4Ben-hmZ7aZzkm3xKFz6Grtsh5ekHJJUchaFvGhJtVIynmIEfD7-ft5A_uiQtGsyzMF4yf_4WKCuyKPsmlxVRYR02SZk77s2J9l_F5YkMnXMa-GSKO66STlMUMNwcOJ7VLKYm8Cy1IYBR90x4iC6gAOcwH3x-Ex1TrvcdbleaxhBHRXmA82xQBYEG8JNuZ28DGftTme4sqkLFhrxGgYu7efFu2OLVTx2c8v4r_1JM4LVksfL4UQfI1_vI1BcYiVZW0OT4JQ=w1879-h939-ft)

The Build is a success when you have a `sb3t-$versionNum-$versionType.jar` file in the workspace of your build

![Job](https://lh3.googleusercontent.com/fife/AAWUweUlv2zx7MsLr2UsovZbOzI8JcA1Owp_HjEs960PEy_9Mx6ytdt2AC3WUZFZUal7D5TLzeK6dkszJaQAknbuUx6L68kX8VrcZwBtm2B8OpddcU9P6hm2-3aufXMvHGfLLLtTdd-tHK2w-2GBr6oh_tKtWy5aXmc9g4MudYqs_Uvfbopr4JaJgyY-CABNqeMMAE8Yg6M1r6eLE8sFIaFoGsNTigOP3k9og3P2M3Fkwcf5HSbNbW1DKJR5MVW_bCXsFKeI-ikUisxbh4qqL3DywOEPYsLbsa-jlx2pGJHPVd7X2-82-qy6MYQSs1q0L9ESUYfFHGJzqVXxiE4yNpw3DxbjgV8V7rEY_NSiE3wkGdSXL5CNIUTvDbeGGXLRDkdvzv1D0Tis_xW-NXXARNvRgzjkjQxJK5MT9foeiQ9TmbC34R-FvZekHuFznT50GpcbnDl9kdOO4OX-UB2eXOqo79HHD627wGUdGv_dof8_jubJkkzllEXhN4X3nBdZsjo7jh3HF8S15uFYInWi4i9QJuFf6MHNiUHhBuoBAKobkz7rCkjvkCxrWiO7z8OXxg3gPQAJ9B8BaOJmnlW2zzHEBCoS5S8oKIVgXthBfFQs7VWWYo80Z6oe2JOKZA0WQfpCAjJV48QCl1aEX3Sw01E-NhabqMXcpg364DZ8Pjz0FTQJlBy-sgC0uzJaEXX7_UjD9Tbkq2ZW-dRopIT4Y-LMq2NSPSzHu3OWX4c=w1879-h939-ft)

## Author

Bryan Authiat  
Twitter: [@KelBornn](https://twitter.com/kelbornn)

## Version History

* Wait and see for release ;)