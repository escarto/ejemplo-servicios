
#!/usr/bin/python
from flask import Flask
import os
import commands
import json
app = Flask(__name__)


@app.route("/")
def hello():
	r= commands.getoutput('ls /home |sort')
	b=r.split("\n")
	users_dict = {}
	users_dict["users"] = b
	return json.dumps(users_dict) 
	

if __name__ == "__main__":
    app.run('0.0.0.0',debug=True)
