
# Containerized Minecraft Server

This projects is a collection of everything you need to create your own containerized minecraft server deployment using docker or kubernetes. 

## Features

- Minecraft Version support for 1.20.0 and up!
- Fully automatic download of supported server jar files
- Autonomous server booting on start of container


## Deployment

### Requirements

- Healthy installation of the Docker Engine or
- (soon) a healthy kubernetes instance
- Internet connection to download the image or manifest

### Docker Deployment

A Deployment using docker is really simple. You just need to execute this command and change the arguments as needed. In case you are using linux you may need to execute the command with root privileges. 

```bash
  docker run -d -p 25565:25565 --env version="1.21.1" fourtyseven/minecraft_server:latest
```

### Kubernetes Deployment

Coming soon!

### Troubleshooting

#### Docker Deployment

In case you receive the following error message you need to change the assigned port argument in the run command. 
```
docker: Error response from daemon: Ports are not available: exposing port TCP 0.0.0.0:25565 -> 0.0.0.0:0: listen tcp 0.0.0.0:25565: bind: Only one usage of each socket address (protocol/network address/port) is normally permitted.
```

## Authors

- [@FourtySeven047](https://www.github.com/fourtyseven047)


## License

MIT License

Copyright (c) 2024 Thorben Buenger

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.