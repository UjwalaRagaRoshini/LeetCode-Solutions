@echo off
cd /d "C:\Users\Ujwala\OneDrive\Documents\LeetCode\LeetCode-Solutions"
git add .
set /p commitMsg="Enter commit message: "
git commit -m "%commitMsg%"
git push origin main
echo.
echo ✅ Successfully pushed to GitHub!
pause
