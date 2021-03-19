FROM nginx:stable-alpine

# Install nvm with node and npm
RUN apk update \
    && apk add --no-cache libuv openssh-keygen openssh-server openrc rsync \
    && apk add --no-cache --update-cache nodejs nodejs-npm git \
    && mkdir -p /run/openrc \
    && touch /run/openrc/softlevel \
    && echo "NodeJS Version:" "$(node -v)" \
    && echo "NPM Version:" "$(npm -v)" \
    && rc-service sshd start \
    && ssh-keygen -t rsa -b 4096 -f /root/.ssh/id_rsa -q -P ""