echo "Enter your first name & last name: "
read -r fname lname

echo "Enter mobile"
read -r mobile

echo "Enter your email"
read -r email

echo "Enter your password"
read -r password

name_regex='^[A-Z][a-z]{2,}$'
email_regex='^[a-zA-Z0-9._%+-]{3,}@[a-zA-Z]+\.[a-zA-Z]{2,}$'
mobile_regex='^[0-9]{10}$'
pass_regex='^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,}$'

if [[ $fname =~ $name_regex && $lname =~ $name_regex &&
      $email =~ $email_regex && $password =~ $pass_regex &&
      $mobile =~ $mobile_regex ]]; then
    echo "valid"
else
    echo "invalid"
fi
