export function wordPattern(word: string): string {
    return word.split("")
        .map(function (this: any, character: string) {
            if (!this.dictionary.has(character.toLowerCase())) {
                this.dictionary.set(character.toLowerCase(), this.counter);
                this.counter++;
            }
            return this.dictionary.get(character.toLowerCase());
        }, { counter: 0, dictionary: new Map<string, number>() })
        .join(".");
}
