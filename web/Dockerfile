FROM node:14


RUN npm install -g grunt grunt-cli grunt-contrib-sass \
    && apt-get update \
    && apt-get install -y python3 python3-pip

RUN apt-get install -y nano ruby-full \
    && gem install rubygems-update -v 3.3.27 \
    && gem update --system --no-document \
    && gem install ffi -v 1.17.1 \
    && gem install sass

COPY ./web /home/node

WORKDIR /home/node

VOLUME /home/node/src

RUN npm install

USER node

SHELL ["/bin/bash", "-c"]

CMD ["/bin/bash"]

ENTRYPOINT ["sh", "start.sh"]
