FROM nginx:stable-alpine

WORKDIR /root

RUN apk update \
    && apk add --no-cache openssh python3 \
    && rm  -rf /tmp/* /var/cache/apk/* \
    && ssh-keygen -t rsa -b 4096 -f /root/.ssh/id_rsa -q -P ""

ADD docker-entrypoint.sh /usr/local/bin
RUN chmod +x /usr/local/bin/docker-entrypoint.sh
RUN rm -rf /etc/ssh/ssh_host_rsa_key /etc/ssh/ssh_host_dsa_key

EXPOSE 22

ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["nginx", "-g", "daemon off;"]