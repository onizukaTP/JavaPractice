shopt -s extglob

echo "Enter word ending with thing"
read -r word

if [[ $word == @(some|any)thing ]]; then
  echo "yes"
else
  echo "no"
fi
