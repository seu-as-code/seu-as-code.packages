# http://bashrcgenerator.com
export PS1="\[\033[38;5;2m\]\u@\h:\[$(tput sgr0)\]\[\033[38;5;4m\][\W]\[$(tput sgr0)\]\[\033[38;5;2m\]\\$\[$(tput sgr0)\]\[\033[38;5;15m\] \[$(tput sgr0)\]"

if [ -f ~/.bash_aliases ]; then
. ~/.bash_aliases
fi
