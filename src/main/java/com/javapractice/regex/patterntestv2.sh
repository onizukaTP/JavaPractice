echo "Enter the thing here"
read -r pattern

# Use double brackets + =~ for regex
if [[ $pattern =~ ^([0-9]*[a-zA-Z]){3}$ ]]; then
    echo "valid"
else
    echo "invalid"
fi
