# How to Change %userprofile% Path in Windows

1. Activate `Administrator` account and switch current logged in account to `Administrator`
2. Find the user account registry under the `HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\ProfileList\` and modify value of `ProfileImagePath`
3. Restart computer
4. Configure "User Account" config with `netplwiz`
5. Switch to target user and disable `Administrator`
